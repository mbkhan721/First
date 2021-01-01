/*
Part 2: Finding a Gene - Using the Simplified Algorithm Reorganized
This assignment will determine if a DNA strand has a gene in it by using the
simplified algorithm from the lesson, but organizing the code in a slightly
different way. You will modify the method findSimpleGene to have three
parameters, one for the DNA string, one for the start codon and one for the
stop codon.

Specifically, you should do the following:

1. Create a new Java Class named Part2 in the StringsFirstAssignments project.

2. Copy and paste the two methods findSimpleGene and testSimpleGene  from the
Part1 class into the Part2 class.

3. The method findSimpleGene has one parameter for the DNA string named dna.
Modify findSimpleGene to add two additional parameters, one named startCodon
for the start codon and one named stopCodon for the stop codon. What additional
changes do you need to make for the program to compile? After making all changes,
run your program to check that you get the same output as before.

4. Modify the findSimpleGene method to work with DNA strings that are either all
uppercase letters such as “ATGGGTTAAGTC” or all lowercase letters such as
“gatgctataat”. Calling findSimpleGene with “ATGGGTTAAGTC” should return the answer
with uppercase letters, the gene “ATGGGTTAA”, and calling findSimpleGene with
“gatgctataat” should return the answer with lowercase letters, the gene “atgctataa”.
HINT: there are two string methods toUpperCase() and toLowerCase(). If dna is the
string “ATGTAA” then dna.toLowerCase() results in the string “atgtaa”.
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        if (startCodon == startCodon.toUpperCase()) {
            dna = dna.toUpperCase();
        }
        else if (startCodon == startCodon.toLowerCase()) {
            dna = dna.toLowerCase();
        }
        int atg = dna.indexOf(startCodon);
        if (atg == -1) {
            return "No ATG found!";
        }
        int taa = dna.indexOf(stopCodon, atg + 3);
        if (taa == -1) {
            return "No TAA found!";
        }
        String result = dna.substring(atg, taa + 3);
        if ((taa - atg) % 3 == 0) {
            return result;
        }
        return "";
    }

    public static void main(String[] args ) {
        Part2 p = new Part2();

        // public void testSimpleGene() {
        String dna = "CGCDCDCSCTAADCD";
        String startCodon = "ATG";
        String stopCodon = "TAA";
        System.out.println("DNA strand: " + dna);
        String gene = p.findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene: " + gene);

        dna = "GEGEATGCGCCGCGC";
        startCodon = "ATG";
        stopCodon = "TAA";
        System.out.println("DNA strand: " + dna);
        gene = p.findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene: " + gene);

        dna = "GEGECGCCGCCGCGC";
        startCodon = "ATG";
        stopCodon = "TAA";
        System.out.println("DNA strand: " + dna);
        gene = p.findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene: " + gene);

        dna = "GEGATGCCGCCGTAA";
        startCodon = "ATG";
        stopCodon = "TAA";
        System.out.println("DNA strand: " + dna);
        gene = p.findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Substring is 6: " + gene);

        dna = "GEGATGCCGCGTAA";
        startCodon = "ATG";
        stopCodon = "TAA";
        System.out.println("DNA strand: " + dna);
        gene = p.findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Substring is not mult of 3: " + gene);
    }
}
