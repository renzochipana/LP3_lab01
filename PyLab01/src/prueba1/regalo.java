package prueba1;

public class regalo {
	public static String elegir(int vida){
        String gift = "";
        switch(vida){
        case 1: gift="un pasaje al caribe";break;
        case 2: gift="una visita al museo mas cercano a tu casa ";break;
        case 3: gift="una netrada al cine";break;
        }
        return gift;
    }
}
