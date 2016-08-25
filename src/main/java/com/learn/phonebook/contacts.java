package com.learn.phonebook;
import java.util.*;
import org.apache.commons.cli.*;
class contacts{
	public static void main(String[] args) throws ParseException{
		BasicParser parser=new BasicParser();
		Options name=new Options();
		name.addOption("n",true,"Name of person");
		CommandLine cmd=parser.parse(name, args);
		
		if (cmd.hasOption('n')) {
			System.out.println(cmd.getOptionValue("n"));	
		}
			
/*		CommandLine cmd=parser.parse(options,args);
		HashMap<String,Long> contacts=new HashMap<String,Long>();
		for(int i=0;i<args.length;i+2)
		{
			contacts.put(args[i],args[i+1]);
		}
		Set names=contacts.keySet();
		System.out.println("List of names in contacts"+names);
		for (Object name:names){
			System.out.println(name+":"+contacts.get(name)+"\n");
		}
*/

	}


}
