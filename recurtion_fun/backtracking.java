package recurtion_fun;

public class backtracking {
    public static void main(String[] args) {
      //  System.out.println(count(3,3));  it will for number of the way for the down and righ
       // path("",3,3); // it for the path for the down and right
        diogonal("",3,3); // it is for the down ,right and diagonal
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int down=count(r-1,c);
        int right=count(r,c-1);
        return down+right;
    }
    static void path(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            path(p+'D',row-1,col);
        }
        if(col>1){
            path(p+'R',row,col-1);
        }
    }

    static void diogonal(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1&&col>1){
            path(p+'D',row-1,col-1);
        }
        if(row>1){
            path(p+'V',row-1,col);
        }
        if(col>1){
            path(p+'H',row,col-1);
        }



    }
}
