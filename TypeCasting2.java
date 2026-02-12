class TypeCasting2 {
    static short methodOne(long l) {
        int i = (int) l;  
        return (short)i; //3. Terjadi overflow karena bilangan 103924 tidak cukup pada tipe data short, sistem akan mengambil 16 bit terakhir.
    }

    public static void main(String[] args) {
        double d = 103924.9017893; 
        float f = (float) d; //1. tidak presisi karena tipe float presisinya lebih kecil dari double, mengakibatkan beberapa digit di belakang koma hilang
        byte b = (byte) methodOne((long) f); //2. Pada bagian (long) f, beberapa digit di belakang koma dipotong, sehingga informasi angka desimal hilang.
        System.out.println(b); //4. Terjadi overflow karena hasil dari tipe short tidak cukup pada tibe data byte, sistem akan mengambil 8 bit terakhir. 
    }
}
