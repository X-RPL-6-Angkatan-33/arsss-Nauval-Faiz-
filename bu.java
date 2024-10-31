    import java.util.Scanner;
    public class bu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        int[] angka1 = new int[jumlahData];
        String[] nama = new String[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Input angka ke-" + (i + 1) + ": ");
            angka1[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Input nama ke-" + (i + 1) + ": ");
            nama[i] = scanner.nextLine();
        }


        System.out.println("\nData yang diinput:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka1[i] + ", Nama: " + nama[i]);
        }

        scanner.close();
    }
}


