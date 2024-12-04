section .data
    result db 0          ; Espaço para armazenar o resultado (inicializado como 0)

section .text
global main

main:
    ; Carrega os valores 3 e 4 nos registradores
    mov eax, 3           ; Carrega 3 no registrador EAX
    mov ebx, 4           ; Carrega 4 no registrador EBX

    ; Soma os valores
    add eax, ebx         ; EAX = EAX + EBX (soma)

    ; Armazena o resultado na variável 'result'
    mov [result], eax    ; Armazena o resultado em 'result'

    ; Exibe o resultado (chamada do sistema, depende do ambiente)
    ; Para simplificação, não incluir a chamada real para imprimir na tela
    ; Retorna da função main
    ret
