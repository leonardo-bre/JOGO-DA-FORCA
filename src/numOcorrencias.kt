fun numOcorrencias(palavra: String, letra: Char): Int? {
    var contador = 0
    var letra2 = 0
    if (letra != null) {
        while (letra2 < palavra.length) {
            if (palavra[letra2] == letra) {
                contador ++
                letra2 ++

            } else {
                letra2 ++
            }
        }
        return if (contador==0){
            null
        }else{
            contador
        }
    }else {
        (letra2== null)
        return null
    }

}
