package homework.week3;

/**
 * Created by Anastasya on 09.05.2017.
 */
//11. Реализовать
//class Parking
//               methods
//               - addMotoOnLastFreePlace
//                       - takeLastMoto
//                       - addMotoByPlaceNumber
//                       - takeMotoByPlaceNumber
//                       - clearGaragePlaces
//                       - open
//                       - close
//                       - changeAddress
//                       - showAllInGarage
//
//class Biker
//               methods
//               - buyMotorcycle
//                       - sellMotorcycle
//                       - fixMotorcycle
//
//class Bike
public class Task10 {
    public static void main(String[] args) {
        Parking parking1 = new Parking();
        parking1.moto = "auto";
        String []parkingPlace ={"moto1", "moto2", "bike", " "};


        addMotoOnLastFreePlace(parking1,parkingPlace);
    }
    public static void addMotoOnLastFreePlace(Parking parking1,String[]parkingPlace) {
        for (int i = 0; i < parkingPlace.length; i++) {
            if (parkingPlace[i].equals(" ")) {
              //  parkingPlace[i] = parking1;
            }
        }
        System.out.println(parkingPlace);
    }
    static class Parking {
        String moto;
        String []parking;


    }
}


