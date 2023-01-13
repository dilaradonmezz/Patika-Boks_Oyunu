public abstract class BoksOyunu {
    public static void main(String [] args){


    Fighter f1= new Fighter("A", 10, 120, 100, 40); // her defasında 10 hasar verir.
    Fighter f2= new Fighter("B", 20, 85, 85, 30);

    Match match=new Match(f1, f2, 85, 100);
    match.run();
}

}
