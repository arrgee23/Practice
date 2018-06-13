package rahul.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnumDiff {
	public static final int SIZE = 4000;
	public static void showDiff() {
		String emilia = null;
		String ramona = null;
		
		
		try {
			emilia = new Scanner(new File("PrnCM_FeatureConfig(Gen)e.h")).useDelimiter("\\Z").next();
			
			ramona = new Scanner(new File("PrnCM_FeatureConfig(Gen).h")).useDelimiter("\\Z").next();
			
			String ifdefPatternString = "#define [A-Z0-9_]*";
			
			Pattern ifdefPattern = Pattern.compile(ifdefPatternString);
			Matcher matcher = ifdefPattern.matcher(ramona);
			
			
			String[] ramonaIfdefs = new String[SIZE];
			int rIfdefcount = 0;
			while(matcher.find()) {
				//System.out.print(rIfdefcount + ": ");
				StringBuffer sbRamonaIfdef = new StringBuffer();
				int s = matcher.start()+8;
				int e = matcher.end();
				for(int i=s;i<e;i++) {
					sbRamonaIfdef.append(ramona.charAt(i));
					//System.out.print(ramona.charAt(i));
				}
				ramonaIfdefs[rIfdefcount++] = sbRamonaIfdef.toString();
				//System.out.println(ramonaIfdefs[rIfdefcount-1]);
			}
			//System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
			
			// do same for emilia
			matcher = ifdefPattern.matcher(emilia);
			String[] emiliaIfdefs = new String[SIZE];
			int eIfdefcount = 0;
			while(matcher.find()) {
				StringBuffer sbRamonaIfdef = new StringBuffer();
				//System.out.print(count + ": ");
				int s = matcher.start()+8;
				int e = matcher.end();
				for(int i=s;i<e;i++) {
					sbRamonaIfdef.append(emilia.charAt(i));
					//System.out.print(ramona.charAt(i));
				}
				emiliaIfdefs[eIfdefcount++] = sbRamonaIfdef.toString();
				//System.out.println(emiliaIfdefs[eIfdefcount-1]);
			}
			
			
			String undefPatternString = "#undef.*";
			
			Pattern undefPattern = Pattern.compile(undefPatternString);
			Matcher matcher2 = undefPattern.matcher(ramona);
			
			StringBuffer sb = new StringBuffer();
			String[] ramonaUndefs = new String[SIZE];
			int count2 = 0;
			while(matcher2.find()) {
				//System.out.print(count2 + ": ");
				int s = matcher2.start()+7;
				int e = matcher2.end();
				for(int i=s;i<e;i++) {
					sb.append(ramona.charAt(i));
					//System.out.print(ramona.charAt(i));
				}
				ramonaUndefs[count2++] = sb.toString();
				//System.out.println();
			}
			
			matcher2 = undefPattern.matcher(emilia);
			
			sb = new StringBuffer();
			String[] emiliaUndefs = new String[SIZE];
			count2 = 0;
			while(matcher2.find()) {
				//System.out.print(count2 + ": ");
				int s = matcher2.start()+7;
				int e = matcher2.end();
				for(int i=s;i<e;i++) {
					sb.append(emilia.charAt(i));
					//System.out.print(emilia.charAt(i));
				}
				emiliaUndefs[count2++] = sb.toString();
				//System.out.println();
			}
			
			System.out.println("#defines in ramona but not in emilia:\n");
			for(int i=0;i<rIfdefcount;i++) {
				String sr= ramonaIfdefs[i];
				boolean found = false;
				for(int j=0;j<eIfdefcount;j++) {
					if(sr.equals(emiliaIfdefs[j])) {
						found = true;
						break;
					}
				}
				if(found==false) {
					System.out.println(sr);
				}
			}
			
			
			System.out.println("\n\n#defines in Emilia but not in Ramona: \n");
			for(int i=0;i<eIfdefcount ;i++) {
				String sr= emiliaIfdefs[i];
				boolean found = false;
				for(int j=0;j<rIfdefcount;j++) {
					if(sr.equals(ramonaIfdefs[j])) {
						found = true;
						break;
					}
				}
				if(found==false) {
					System.out.println(sr);
				}
			}
			
			
			/*
			// read every #define from ramona and find corresponding #undef in emilia
			int lastIndex = 0;
			StringBuilder ifdefRamona = new StringBuilder();
			StringBuilder ifdefEmilia = new StringBuilder();
			
			for(int i=0;i<ramona.length();) {
				i = ramona.indexOf("#define",i)+7;
				
				int temp = i+1;
				while(temp<ramona.length() && ramona.charAt(temp)==' ') // reject preceding space
					temp++;
				
				while(temp<ramona.length() &&  (ramona.charAt(temp)!=' ' || ramona.charAt(temp)!='\n')) {
					ifdefRamona.append(ramona.charAt(temp));
					temp++;
				}
				System.out.println(ifdefRamona);
				
				// search for same ifdef with undef in emilia
				int j = emilia.indexOf(ifdefRamona.toString());
				int copy = j;
				while(j>0 && emilia.charAt(j)!='#')
					j--;
				if(j!=0) {
					for(int k = copy;k>j;k--) {
						if(emilia.charAt(k)=='u') {} // start of undef
							//System.out.println(ifdefRamona.toString());
					}
				}
				
				// search for same ifdef with undef in emilia
				for(int j=0;j<emilia.length();j++) {
					j = emilia.indexOf("#undef")+6;
					int temp2 = j+1;
					while(temp2<emilia.length() && emilia.charAt(temp2)==' ') // reject preceding space
						temp2++;
					while(temp2<emilia.length() && (emilia.charAt(temp2)!=' ' || emilia.charAt(temp2)!='\n'))
					j=temp2;
					
				}
			}
			//System.out.println(emilia);
		
			*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		showDiff();
	}

}
