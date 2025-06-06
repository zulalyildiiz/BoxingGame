public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    void run(){
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("-- YENİ ROUND ---");
                this.f2.health = this.f1.hit(f2);
                System.out.println(this.f2.name + " kalan canı: " + this.f2.health);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                System.out.println(this.f1.name + " kalan canı: " + this.f1.health);
                if (isWin()) {
                    break;
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri uygun değil!");
        }
    }
    boolean isWin(){
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        return false;
    }
}
