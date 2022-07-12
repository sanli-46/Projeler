public class Ring {
    Players p1;
    Players p2;

    Ring(Players p1,Players p2){
        this.p1=p1;
        this.p2=p2;
    }
    void StartRun() {
        if (p1.first()) {
            run(p1, p2);
        } else {
            run(p2, p1);
        }
    }

        void run(Players p1,Players p2){
            while (this.p1.healty>0&&this.p2.healty>0){
                System.out.println("====== New Round =====");
                this.p2.healty=this.p1.hit(this.p2);
                if(isWin()){
                    break;
                }
                this.p1.healty=this.p2.hit(p1);
                if (isWin()){
                    break;
                }
                System.out.println(p1.name+"   Health  :"+this.p1.healty);
                System.out.println(p2.name+"   Health   :"+this.p2.healty);

            }
        }
        boolean isWin(){
            if (this.p1.healty==0){
                System.out.println(this.p2.name+"  Kazandi !!!");

            return true;
            }
            if (this.p2.healty==0){
                System.out.println(this.p1.name+"  Kazandi !!!");

                return true;
            }
            return false;
    }
    }

