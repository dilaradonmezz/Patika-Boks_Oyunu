import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minweight, maxweight, round=0;

    Match(Fighter f1, Fighter f2, int minweight, int maxweight){
        this.f1=f1;
        this.f2=f2;
        this.minweight=minweight;
        this.maxweight=maxweight;
    }

    void run(){
        if(isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) { //=while(true){}
                if(round==0)
                    System.out.println("==== İLK ROUND ====");
                else
                    System.out.println("==== " +round+ ".ROUND ====");
                if(whoIsFirst()) {
                    System.out.println("Oyuna " +this.f1.name + " başlıyor.");
                    this.f2.health = this.f1.hit(f2); // metodun çağrıldığı nesne hasarı vericek fighter
                    if (isWin())
                        break;
                    this.f1.health = this.f2.hit(f1);
                    if (isWin())
                        break;
                }

               else{
                    System.out.println("Oyuna " +this.f2.name + " başlıyor.");
                    this.f1.health = this.f2.hit(f1);
                    if (isWin())
                        break;
                    this.f2.health = this.f1.hit(f2); // metodun çağrıldığı nesne hasarı vericek fighter
                    if (isWin())
                        break;
                }
               round++;
                    System.out.println(this.f1.name + " Sağlık--> " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık--> " + this.f2.health);

            }
        }
        else
            System.out.println("Sporcuların sikletleri uymuyor!");
    }
    boolean isCheck(){
        return ((this.f1.weight>=minweight && this.f1.weight<=maxweight) &&
                (this.f2.weight>=minweight && this.f2.weight<=maxweight));
    }

    boolean isWin(){
        if(this.f1.health==0) {
            System.out.println(this.f2.name + " kazandı!");
            System.out.println("Oyun " + round + ". Rountta sonlandı.");
            return true;
        }
        if(this.f2.health==0) {
            System.out.println(this.f1.name + " kazandı!");
            System.out.println("Oyun " + round + ". Rountta sonlandı.");
            return true;
        }
        return false;
    }

    boolean whoIsFirst(){
        Random rastgele=new Random();
        int randomWho= rastgele.nextInt(2)+1;
        System.out.println("Başlayanı bulmak için Random sayı: " + randomWho);
        return (randomWho==2);
                /*
        double randomWho=Math.random()*100;
        //int randomWho= rastgele.nextInt(2)+1;
        System.out.println("Başlayanı bulmak için Random sayı: " + randomWho);
        return (randomWho>=50);
                 */
        /*
        if((int)Math.random()*100/2==1)
            return false;
        else return true;
         */

    }
}
