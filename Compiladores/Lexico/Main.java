package Lexico;

import java.util.*;

enum TokenType {
    KEYWORD, IDENTIFIER, NUMBER, SYMBOL, WHITESPACE
}

class Token {
    TokenType type;
    String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + type + ", \"" + value + "\")";
    }
}

class Lexer {
    private static final Set<String> KEYWORDS = new HashSet<>(Arrays.asList(
            "if", "else", "while", "return"
    ));

    private static final Set<Character> SYMBOLS = new HashSet<>(Arrays.asList(
            '(', ')', '{', '}', '+', '-', '=', ';'
    ));

    public List<Token> tokenize(String code) {
        List<Token> tokens = new ArrayList<>();
        StringBuilder currentToken = new StringBuilder();

        int length = code.length();
        for (int i = 0; i < length; i++) {
            char currentChar = code.charAt(i);

            // Ignorar espaços em branco e quebras de linha
            if (Character.isWhitespace(currentChar)) {
                continue;
            }

            // Identificar símbolos
            if (SYMBOLS.contains(currentChar)) {
                tokens.add(new Token(TokenType.SYMBOL, String.valueOf(currentChar)));
                continue;
            }

            // Identificar números
            if (Character.isDigit(currentChar)) {
                currentToken.setLength(0); // Limpar o token atual
                while (i < length && Character.isDigit(code.charAt(i))) {
                    currentToken.append(code.charAt(i));
                    i++;
                }
                i--; // Ajustar o índice para não perder o próximo caractere
                tokens.add(new Token(TokenType.NUMBER, currentToken.toString()));
                continue;
            }

            // Identificar palavras-chave ou identificadores
            if (Character.isLetter(currentChar)) {
                currentToken.setLength(0); // Limpar o token atual
                while (i < length && (Character.isLetterOrDigit(code.charAt(i)) || code.charAt(i) == '_')) {
                    currentToken.append(code.charAt(i));
                    i++;
                }
                i--; // Ajustar o índice para não perder o próximo caractere
                String word = currentToken.toString();
                if (KEYWORDS.contains(word)) {
                    tokens.add(new Token(TokenType.KEYWORD, word));
                } else {
                    tokens.add(new Token(TokenType.IDENTIFIER, word));
                }
                continue;
            }

            // Se o caractere não for reconhecido, pode ser tratado como um erro ou ignorado.
        }

        return tokens;
    }
}

public class Main {
    public static void main(String[] args) {
        String code = """
            if (x == 10) {
                return y + 1;
            } else {
                x = x - 1;
            }
        """;

        Lexer lexer = new Lexer();
        List<Token> tokens = lexer.tokenize(code);

        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}


