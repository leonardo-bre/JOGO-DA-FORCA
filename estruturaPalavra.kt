fun estruturaPalavra(palavra: String, letra: Char?): String {
    var palavrateste = ""
    var letra3 = 0
    if (letra == null) {
        while(letra3 < palavra.length){
            palavrateste += "_ "
            letra3++
        }
        return palavrateste
    }else{
        while (letra3 < palavra.length){
            if  (palavra[letra3]==letra){
                palavrateste += "$letra "
                letra3++
            } else {
                (palavra[letra3]!=letra)
                palavrateste += "_ "
                letra3++
            }
        }
        return palavrateste
    }
}
