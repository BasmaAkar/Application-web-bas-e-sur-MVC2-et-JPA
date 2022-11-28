# Application-web-bas-e-sur-MVC2-et-JPA
L’objectif principal de cet atelier et de maitriser l’API JPA « java persistance API » par la mise en place d’une application web qui simule le comportement d’un site web e-Commerce, la partie contrôleur de cette application sera basé su le MVC 2 c.à.d. une Servlet va contenir tous les actions nécessaire liées à une gestion spécifique.

__** Etape 1** :_ 
### 
Durant cette étape il faut mettre en place un digramme de classe qui représente la gestion
d’un site e-commerce, le digramme sera composé de plusieurs classes, mais il faut se concentrer sur la
gestion du panier, vitrine, et internaute .
### **__**
_### **Etape 2 :**_
###
Créez un projet Web dynamique avec un web module d’une version supérieur à 3 ensuite convertissez le projet vers un projet Maven puis ajoutez les dépendances Mysql-Connector, JPA au niveau du fichier pom.xml.
### 
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<version>8.0.12</version>
</dependency>
<dependency>
<groupId>org.eclipse.persistence</groupId>
<artifactId>javax.persistence</artifactId>
<version>2.0.0</version>
</dependency>
<dependency>
<groupId>org.eclipse.persistence</groupId>
>artifactId>eclipselink</artifactId<
>version>2.7.5</version<
>dependency/<
_### **Etape 3 :
 créez la couche model/persistance en utilisation les entités et les transactions JPA, puis
générez la BDD au niveau de la SGBD MYSQL, n’oubliiez pas de mettre en place les fichiers de
configuration nécessaires pour le bon fonctionnement de l’API JPA .
