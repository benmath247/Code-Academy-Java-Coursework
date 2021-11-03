package sequencingDNA;


/*
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
 */


public class DNA {
    public static boolean test(String dna){
        return (test1(dna) && test2(dna) && test3(dna));

    }

    public static boolean test1(String dna){
        return dna.indexOf("ATG") == 0;
    }
    public static boolean test2(String dna){
        //needed to add fromIndex field because it was detecting TGAs in the middle
        return dna.indexOf("TGA", dna.length()-3)==dna.length()-3;
    }
    public static boolean test3(String dna){
        return dna.substring(3, (dna.length() - 3)).length() % 3 == 0;
    }

    public static void main(String[] args){
        String dna1 = "ATGCGATACGCTTGA", dna2 = "ATGCGATACGTGA", dna3 = "ATGATATGTACATGA";
        System.out.println(test(dna1));
        System.out.println(test(dna2));
        System.out.println(test(dna3));

//                testing problems wit dna3 output
////        System.out.println(""+test1(dna3)+test2(dna3)+test3(dna3));
//        System.out.println(dna3.length()-3);
//        System.out.println(dna3.indexOf("TGA"));








    }
}
