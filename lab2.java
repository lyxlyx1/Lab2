����   < �  lab2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Llab2; main ([Ljava/lang/String;)V 
Exceptions  java/io/IOException  java/io/File  C:/Users/lyx/Desktop/test.txt
     (Ljava/lang/String;)V
     level1 6(Ljava/lang/String;Ljava/lang/String;ILjava/io/File;)V
     ! level2 #(Ljava/lang/String;Ljava/io/File;)V
  # $ ! level3
  & ' ! level4 args [Ljava/lang/String; keynum I file Ljava/io/File; text Ljava/lang/String; keytext 2 java/io/BufferedReader 4 java/io/FileReader
 3 6  7 (Ljava/io/File;)V
 1 9  : (Ljava/io/Reader;)V < !C:/Users/lyx/Desktop/keywords.txt
 > @ ? java/lang/String A B contains (Ljava/lang/CharSequence;)Z
 1 D E F readLine ()Ljava/lang/String;	 H J I java/lang/System K L out Ljava/io/PrintStream; N java/lang/StringBuilder P totol num: 
 M 
 M S T U append (I)Ljava/lang/StringBuilder;
 M W X F toString
 Z \ [ java/io/PrintStream ]  println test Ljava/io/BufferedReader; file1 key StackMapTable d switch f switch num:  h case j 
case num: 
 Z l m  print
 > o p q valueOf (I)Ljava/lang/String; s  
 M u T v -(Ljava/lang/String;)Ljava/lang/StringBuilder; x   test1 	switchnum test2 num i ca [I r  � else if � else � if � if-else num:  test3 ifcount 	elsecount elseifcount IF [Z ELSE ELSEIF ifelsecount � � if-elseif-else num:  ifelseifelsecount 
SourceFile 	lab2.java !               /     *� �    
                    	             �     )<� Y� MN:-,� -,� -,� "-,� %�    
   & 	           	  
   #  (     4    ) ( )    ' * +    , -    . /    0 /  	                 j� 1Y� 3Y-� 5� 8:� 8� Y;� :� 1Y� 3Y� 5� 8:� *+� =� �� CYL���� CYK��Ĳ G� MYO� Q� R� V� Y�    
   .           1  4  <  ?  I  S  i     H    j . /     j 0 /    j * +    j , -   Y ^ _   * ` -  1  a _  b    �  1�   1
� 	 	   !          �  	   ʻ 1Y� 3Y+� 5� 8M>� *c� =� �,� CYK��� G� MYe� Q� R� V� Y� 1Y� 3Y+� 5� 8:66�
:� $*c� =� 	��*g� =� \.`O� CYK��ز Gi� k6� #� G� MY.� n� Qr� t� V� k���ܲ Gw� Y�    
   b             ! !  * $ @ % Q & T ' W ( ^ ) a * j + m , p . y / � ) � 2 � 3 � 4 � 3 � 6 � 7    \ 	   � . /     � , -   � y _   � z +  Q y { _  T v | +  W s } +  ^ l ~   � * � +  b   * �  1� ?  >  1 1 �  �  	 $ !          �  
   �� 1Y� 3Y+� 5� 8M>66d�:d�:d�:� N*�� =� dd3� 9�ddT� )*�� =� T�� *�� =� T�,� CYK���d6	� G� MY�� Q	� R� V� Y�    
   Z    9  :  ;  < $ = * > - ? 6 @ B A E B O E R F [ G a H d I g J p K u L x > � O � P � Q    f 
   � . /     � , -   � � _   � � +   � � +   � � +   � � �  $ { � �  * u � �  �  � + 	 b   ! � - 	 >  1 � � �  $ 	 ' !          �  
   �� 1Y� 3Y+� 5� 8M>66d�:d�:d�:� N*�� =� dd3� 9�ddT� )*�� =� T�� *�� =� T�,� CYK���6	� G� MY�� Q	� R� V� Y�    
   Z    S  T  U  V $ W * X - Y 6 Z B [ E \ O ^ R _ [ ` a a d b g c p d u e x X � h � i � j    f 
   � . /     � , -   � � _   � � +   � � +   � � +    � �  $ y � �  * s � �  �  � + 	 b   ! � - 	 >  1 � � �  $  �    �