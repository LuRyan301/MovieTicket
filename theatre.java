import java.util.Scanner;

public class theatre {
    String [] theatre = new String[]{"Theatre 1", "Theatre 2", "Theatre 3"};
    String [] seats = new String[] {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", 
                                    "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", 
                                    "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", 
                                    "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", 
                                    "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", 
                                    "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9",
                                    "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", 
                                    "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9",
                                    };
    int price = 0;
    int seatTotal = 0;

    public void chooseTheatre(){

        Scanner input = new Scanner(System.in);

        // choose type 
        
        ///no premium or normal in theatre type
        System.out.println("Choose Theatre\n1.Premium\n2.Normal");          
        int type = input.nextInt();
        String theatreType = "";

        if(type == 1){
            theatreType = "Premium ";
            price += 350;
        } else if(type == 2){
            theatreType = "Normal ";
            price += 200;
        } else {
            System.out.println("Choose premium or normal");
        }

        // choose theatreNum
        System.out.println("Choose TheatreNum 1-3:");
        int theatreNum = input.nextInt();

        if(theatreNum == 1){
            System.out.println(theatreType + theatre[0]);
        }else if(theatreNum == 2){
            System.out.println(theatreType + theatre[1]);
        }else if(theatreNum == 3){
            System.out.println(theatreType + theatre[2]);
        }else{
            System.out.println("Choose 1-3 only");
        }
    }

    //premium / normal seat yway
    public void chooseSeat(){
        boolean choose = false;

        while(choose == false){

            Scanner input = new Scanner(System.in);
            
            //show seats
            System.out.println("=====Seats Number=====");     
            for(int i = 0; i < seats.length; i++){
                if(seats[i].substring(1,2).equals("9")) {
                    System.out.println(seats[i] + " ");
                } else {
                    System.out.print(seats[i] + " ");
                }
            }
            System.out.println();

            //choose seats
            System.out.print("Choose Seat Number: ");
            String seatNum = input.nextLine();

            for(int i = 0; i < seats.length; i++){
                if(seats[i].equals(seatNum)){
                    for(int j = i; j< seats.length; j++) {
                        seats[i] = "--";
                    }
                    seatTotal++;
                }
            }

            //want more seats?
            System.out.println("Want more seat?\n1.Yes\n2.No");
            int num = input.nextInt();

            if(num == 1){
                choose = false;
            } else if(num == 2){
                choose = true;
            }
        }
        System.out.println(price*seatTotal + " bhat");
    }

    public static void main(String[] args) {
        theatre theatre1 = new theatre();
        theatre1.chooseTheatre();
        theatre1.chooseSeat();
    }
}
