print("Ingresa el mensaje cifrado")
mensajeCifrado = input()
print("Cuántas veces se movió la letra para cifrar")
veces = int(input())

mensajeOriginal = ""

for i in range(len(mensajeCifrado)):
    letra = mensajeCifrado[i]
    min = (letra >= 'a' and letra <= 'z')
    mayus= (letra >= 'A' and letra <= 'Z')

    if not (min or mayus):
        mensajeOriginal += letra  # Mantener caracteres que no son letras.
    else:
        ascii = ord(letra)
        B_Ascii = ord('a')
        if mayus:
            baseAscii = ord('A')

        # Decodificar: Restar la cantidad de veces y ajustar para no ser negativo.
        nuevoAscii = (ascii - B_Ascii - veces + 26) % 26 + B_Ascii
        nuevaLetra = chr(nuevoAscii)
        mensajeOriginal += nuevaLetra

print("Mensaje original:", mensajeOriginal)
