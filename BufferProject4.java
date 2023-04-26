package GrandTest;
import java.io.*;
public class BufferProject4 {
	
	 
	
	    public static void main(String[] args) {
	        try {
	 
	            BufferedReader br = new BufferedReader(new FileReader("ProIn.txt"));
	            BufferedWriter bw = new BufferedWriter(new FileWriter("ProOut.txt"));
	 
	            String line = null;
	 
	            while ((line = br.readLine()) != null) {
	 
	                String[] str = line.split(" ");
	                int[] freq = new int[str.length];
	 
	                for (int i = 0; i < str.length; i++) {
	                    int count = 1;
	                    for (int j = i + 1; j < str.length; j++) {
	                        if (str[i].equalsIgnoreCase(str[j])) {
	                            count++;
	                            freq[j] = -1;
	                        }
	                    }
	                    if (freq[i] != -1) {
	                        freq[i] = count;
	                        System.out.println("Frequency of " + str[i] + " is " + freq[i]);
	                    }
	                }
	 
	                int max = 0, max1 = 0, max2 = 0;
	                String word = null, word1 = null, word2 = null;
	                for (int i = 0; i < freq.length; i++) {
	                    if (freq[i] != -1) {
	 
	                        if (max < freq[i]) {
	                            max = freq[i];
	                            word = str[i];
	                        } else if (max1 < freq[i]) {
	                            max1 = freq[i];
	                            word1 = str[i];
	                        } else if (max2 < freq[i]) {
	                            max2 = freq[i];
	                            word2 = str[i];
	                        }
	                    }
	                }
	                int density = (max * 100) / freq.length;
	                int density1 = (max1 * 100) / freq.length;
	                int density2 = (max2 * 100) / freq.length;
	                bw.write("\nMost frequent word is " + word + " and its density is " + density);
	                bw.write("\nSecond most frequent word is " + word1 + " and its density is " + density1);
	                bw.write("\nThird most frequent word is " + word2 + " and its density is " + density2);
	                bw.flush();
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

