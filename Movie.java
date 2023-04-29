public class Movie {
   
    private int starttime;
    private int runtime;
    private String name;
    //private Theatre theatre;
   
    public int getStarttime() {
        return starttime;
    }


    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }


    public int getRuntime() {
        return runtime;
    }


    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Movie(int starttime, int runtime, String name ) {
        this.starttime = starttime;
        this.runtime = runtime;
        this.name = name;
    }


    public String toString(){


        return "Movie Name: "+name+"\tStart Time: "+starttime+ "\t" +"Run Time: "+runtime + " min";


    }




    public static void main(String[] args){


    Movie movie1 = new Movie(1250, 180, "Snow White");
    System.out.println(movie1.toString());
   
    }




}
