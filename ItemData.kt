class ItemData(val originalValue: Any) {
    
    fun getType(): String? {
        when (this.originalValue) {
            is String -> return "cadena"
            is Int -> return "entero"
            is Boolean -> return "booleano"
            else -> return null
        }
    }
    
    fun getInfo(): String? {
        when (this.originalValue) {
            is String -> {
                val len = this.originalValue.length
                return "L$len"
            }
            is Int -> {
                val mod10 = this.originalValue.mod(10)
                val mod5 = this.originalValue.mod(5)
                val mod2 = this.originalValue.mod(2)
                if (0 == mod10) {
                    return "M10"
                } 
                if (0 == mod5) {
                    return "M5"
                } 
                if (0 == mod2) {
                    return "M2"
                } 
                else {
                    return null
                }
            }
            is Boolean -> {
                if (this.originalValue) {
                    return "Verdadero"
                }
                else {
                    return "Falso"
                }
            }
            else -> {
                return null
            }
        }
    }
}