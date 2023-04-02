package com.jspiders.music;

import java.util.Scanner;

public class MusicPlayer {
static boolean loop=true;
static songOperation operation=new songOperation();
 public static void main(String[] args) {
	musicMenu();
	while(loop) {
	musicMenu();
	}
}
 public static void musicMenu() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Menu: \n 1.Play \n 2.Add/Remove \n 3.Edit \n 4.Exit");
	 System.out.println("choose option ");
	 int key =sc.nextInt();
	 switch(key) {
	 case 1:{
		 System.out.println("1.choose song \n 2.all songs \n 3.random songs \n 4.go back");
	 }
	 System.out.println("choose option ");
	 int key1=sc.nextInt();
	 switch(key1) {
	 case 1:{
		 operation.chooseSongPlay();
		 break;
		 
	      }
		 case 2:{
			 operation.PlayAllSong();
			 break;
		 }
        case 3:{
		 operation.PlayRandom();
		 break; 
		 }
        case 4:{
        	operation.PlayRandom();
        	break;
        }
	 }
	 break;
	  
	 case 2:{
		 System.out.println("1.Add song \n 2.Remove Song \n3.go back");
		 System.out.println("choose option ");
		 int key2=sc.nextInt();
		 switch(key2) {
		 case 1:{
			 operation.addSongs();
			 break;
		 }
		 case 2:{
			 operation.removeSong();
			 break;
		 }
		 case 3:{
			 break;
		 }
		 }
		 loop =false;
		 musicMenu();
		 break;
	 }
		 case 3:{
			 operation.update();
			 loop=false;
			 musicMenu();
			 break;
		 }
		 case 4:{
			 loop =false;
			 musicMenu();
			 break;
		 }
	 }
	 }
 }


