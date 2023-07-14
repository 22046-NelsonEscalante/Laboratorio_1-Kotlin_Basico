public class ItemDataJ {

    private Object value;
    
    public ItemDataJ(Object originalValue) {
        value = originalValue;
    }

    public String getType() {
        String type = value.getClass().toString();

        if (type.equals("class java.lang.String")) {
            return "cadena";
        } else if (type.equals("class java.lang.Integer")) {
            return "entero";
        } else if (type.equals("class java.lang.Boolean")) {
            return "booleano";
        } else {
            return null;
        }
    }

    public String getInfo() {
        if (getType().equals("cadena")) {
            String cad = (String)value;
            int length = cad.length();
            return "L" + length;

        } else if (getType().equals("entero")) {
            int num = (Integer)value;
            int mult = 0;

            if ((num%10) == 0) {
                mult = 10;
            } else if ((num%5) == 0) {
                mult = 5;
            } else if ((num%2) == 0) {
                mult = 2;
            } else {
                return null;
            }

            return "M" + mult;

        } else if (getType().equals("booleano")) {
            boolean var = (boolean)value;
            if (var) {
                return "Verdadero";
            } else {
                return "Falso";
            }

        } else {
            return null;
        }
    }
}
