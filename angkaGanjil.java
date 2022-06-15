package tugas04;


public class angkaGanjil {
    public static void main(String[] args) {
        
        int []  arrayG = {
                    82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,};
        
        System.out.println("\t Menampilkan Bilangan ganjil \n\n");
        System.out.print("\n Bilangan Ganjil: \n");
        
        for(int i = 0; i < 12; i++){
        
            if(arrayG [i] % 2 !=0){
            
                System.out.println(arrayG[i] + ", ");
                
            }
        } 
    }
}
