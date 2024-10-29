import java.util.ArrayList;
import java.util.Scanner;

/**
 * Mewakili pesanan pakaian online, memungkinkan pengguna untuk menambahkan pakaian ke pesanan,
 * melihat daftar produk, dan menghitung total harga pesanan.
 */
class OnlineClothingOrder {
    /**
     * Daftar nama produk dalam pesanan.
     */
    private ArrayList<String> productNames;

    /**
     * Daftar harga produk yang sesuai dengan setiap nama produk.
     */
    private ArrayList<Double> productPrices;

    /**
     * Menginisialisasi pesanan pakaian online baru dengan daftar nama dan harga produk yang kosong.
     */
    public OnlineClothingOrder() {
        productNames = new ArrayList<>();
        productPrices = new ArrayList<>();
    }

    /**
     * Menambahkan produk ke pesanan dengan nama dan harga yang ditentukan.
     *
     * @param productName nama produk yang akan ditambahkan
     * @param productPrice harga produk yang akan ditambahkan
     */
    public void addProduct(String productName, double productPrice) {
        productNames.add(productName);
        productPrices.add(productPrice);
    }

    /**
     * Menampilkan daftar produk dalam pesanan, termasuk setiap nama produk dan harganya.
     */
    public void displayProducts() {
        System.out.println("Daftar Pesanan Baju:");
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println(productNames.get(i) + " - Rp" + productPrices.get(i));
        }
    }

    /**
     * Menghitung total harga semua produk dalam pesanan.
     *
     * @return total harga pesanan
     */
    public double getTotalPrice() {
        double totalPrice = 0;
        for (double price : productPrices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    /**
     * Metode utama untuk berinteraksi dengan pengguna, memungkinkan mereka memasukkan produk dan harga,
     * serta menampilkan ringkasan pesanan akhir dan total harganya.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OnlineClothingOrder order = new OnlineClothingOrder();

        System.out.println("Masukkan jumlah baju yang ingin dipesan:");
        int itemCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Masukkan nama baju:");
            String productName = sc.nextLine();
            System.out.println("Masukkan harga baju:");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            order.addProduct(productName, productPrice);
        }

        order.displayProducts();
        System.out.println("Total Harga: Rp" + order.getTotalPrice());
    }
}
