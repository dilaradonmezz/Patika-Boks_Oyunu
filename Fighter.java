import java.text.DecimalFormat;

public class Fighter {
    String name;
    int damage, health, weight, dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if(dodge>=0 && dodge<=100)
            this.dodge=dodge;
        else
            this.dodge=0;


    }

    int hit(Fighter foe){ // foe=hasarı alacak olan fighter
        System.out.println(this.name + " => " + foe.name+ " " + this.damage + " hasar verdi.");
        if(foe.isDodge()){ //rakip bunu bloklayabilir mi sorgusu yapılıyor
            System.out.println(foe.name + " , " + this.name + "'dan gelen hasarı blokladı");
            return foe.health;

        }
        System.out.println("-------------------");
        if(foe.health - this.damage<0)
            return 0;


        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber= Math.random() * 100;
        DecimalFormat df= new DecimalFormat("##.##");
        randomNumber=Double.valueOf(randomNumber);
        System.out.println("Random Number: " +df.format(randomNumber));
        return randomNumber <= this.dodge; //random sayı bloklamadan küçük olursa bloklama yapılabilir.
    }
}
