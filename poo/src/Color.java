public enum Color {
        ROJO("Rojo"), AMARILLO("Amarillo"), AZUL("Azul"), BALANCO("Blanco"), GRIS("Gris Oscuro"), NARANJO("Naraja"), NEGO("Negro");

    private final String color;

Color(String dato){

    this.color =dato;
}

public String getColor(){
    return this.color;
}

@Override
public String toString(){
    return this.color;
}


}






