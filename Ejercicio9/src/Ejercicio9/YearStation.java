package Ejercicio9;

public class YearStation {

    private String month;
    private int day;

    public YearStation(int day, String month) {
        //en caso de que el usuario introduzca valores fuera de los parametros validos, el dia se igualara a 1.
        if (day < 1 || day > 31) {
            this.day = 1;
            System.out.println("Introduciste valores fuera de los parametros, el dia se tomará como 1");
        }
        this.day = day;
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String whatStationIs() {
        //inicializamos la variable que contendra la estación
        String station = "estacion desconocida";

        /*
        
            En cada condicion de los if evaluo que mes introdujo el usuario y con base a eso con un if anidado,
            verifico el intervalo de dias para deducir la estacion del año
        
         */
        //Para verificar si la estación es primavera
        if (month.equals("marzo") || month.equals("abril") || month.equals("mayo") || month.equals("junio")) {
            if (day >= 20 && month.equals("marzo")) {
                station = "primavera";
            } else if (day >= 1 && month.equals("abril")) {
                station = "primavera";
            } else if (day >= 1 && month.equals("mayo")) {
                station = "primavera";
            } else if (day < 21 && month.equals("junio")) {
                station = "primavera";
            }

        }

        //Verifica si la estación es verano
        if (month.equals("junio") || month.equals("julio") || month.equals("agosto") || month.equals("septiembre")) {
            if (day >= 21 && month.equals("junio")) {
                station = "verano";
            } else if (day >= 1 && month.equals("julio")) {
                station = "verano";
            } else if (day >= 1 && month.equals("agosto")) {
                station = "verano";
            } else if (day < 23 && month.equals("septiembre")) {
                station = "verano";
            }

        }
        //Verifica si la estacion es otoño
        if (month.equals("septiembre") || month.equals("octubre") || month.equals("noviembre") || month.equals("diciembre")) {
            if (day >= 23 && month.equals("septiembre")) {
                station = "otoño";
            } else if (day >= 1 && month.equals("octubre")) {
                station = "otoño";
            } else if (day >= 1 && month.equals("noviembre")) {
                station = "otoño";
            } else if (day < 21 && month.equals("diciembre")) {
                station = "otoño";
            }

        }
        //Verifica si la estacion es invierno
        if (month.equals("diciembre") || month.equals("enero") || month.equals("febrero") || month.equals("marzo")) {
            if (day >= 21 && month.equals("diciembre")) {
                station = "invierno";
            } else if (day >= 1 && month.equals("enero")) {
                station = "invierno";
            } else if (day >= 1 && month.equals("febrero")) {
                station = "invierno";
            } else if (day < 20 && month.equals("marzo")) {
                station = "invierno";
            }
        }

        return station;
    }

}
