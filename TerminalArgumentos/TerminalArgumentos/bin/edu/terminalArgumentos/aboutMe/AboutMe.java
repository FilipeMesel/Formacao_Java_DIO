����   4 T  &edu/terminalArgumentos/aboutMe/AboutMe  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this (Ledu/terminalArgumentos/aboutMe/AboutMe; main ([Ljava/lang/String;)V
    java/lang/Integer   valueOf '(Ljava/lang/String;)Ljava/lang/Integer;
     intValue ()I
    java/lang/Double   &(Ljava/lang/String;)Ljava/lang/Double;
    ! " doubleValue ()D	 $ & % java/lang/System ' ( out Ljava/io/PrintStream; * java/lang/StringBuilder , Olá, me chamo 
 ) .  / (Ljava/lang/String;)V
 ) 1 2 3 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ) 5 6 7 toString ()Ljava/lang/String;
 9 ; : java/io/PrintStream < / println > Tenho 
 ) @ 2 A (I)Ljava/lang/StringBuilder; C anos de vida e 
 ) E 2 F (D)Ljava/lang/StringBuilder; H m de altura args [Ljava/lang/String; nome Ljava/lang/String; 	sobrenome idade I altura D 
SourceFile AboutMe.java !               /     *� �    
                    	       �     ]*2L*2M*2� � >*2� � 9� #� )Y+� -+� 0,� 0� 4� 8� #� )Y=� -� ?B� 0� DG� 0� 4� 8�    
       	  
       7  \     4    ] I J    Y K L   U M L   K N O   @ P Q   R    S