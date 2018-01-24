/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

/**
 *
 * @author AdiRahmad
 */
public class Vigenere {

    static String key = "pktalk";

	private String keySetting(int length) {
		char c;
		String result = "";
		int keyLength = key.length();

		for (int i = 0; i < length; i++) {

			for (int a = 0; a < keyLength; a++) {
				if (result.length() == length) {
					break;
				}
				c = key.charAt(a);
				result += c;
			}
		}

		return result;
	}

	public String enkripsi(String plain) {
		
		String cipher = "";
		
		String newKey = keySetting(plain.length());
		for (int i = 0; i < plain.length(); i++) {
			char c = plain.charAt(i);
			
			char ck = newKey.charAt(i);
			
			if (c == ' ' || c == 32) {
				cipher += ' ';
			} else {
				c = (char) (c + ck);
				
				cipher += c;
			}
		}
		
		

		return cipher;
	}

	public String dekripsi(String cipher) {
		
		String plain = "";
		
		String newKey = keySetting(cipher.length());
		for (int i = 0; i < cipher.length(); i++) {
			char c = cipher.charAt(i);
			
			char ck = newKey.charAt(i);
			
			if (c == ' ' || c == 32) {
				plain += ' ';
			} else {
				c = (char) (c - ck);
				
				plain += c;
			}
		}
		
		

		return plain;
	}
}
