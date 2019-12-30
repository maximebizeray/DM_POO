Web : Pour communiquer avec des API web

JPA : Pour utiliser la base de donnée et les requêtes.

Hibernate : Facilite la relation à la base de donnée

H2 : H2 est une base de donnée JAVA légère et open source

DevTools : utilisé pour déclencher une actualisation du navigateur lorsqu'une ressource est modifiée

Thymeleaf : Pour faire du XHTML/HTML5 en JAVA





Q13) 

1- Nous avons param�tr� l'url d'appel avec "@GetMapping("/greeting")"

2- Nous avons choisi le fichier HTML avec "return "greeting";"

3- Nous envoyons le nom � qui nous disons bonjour avec "@RequestParam(name="nameGET", required=false, defaultValue="World")" 


Q17) 

Une table Article est apparu avec les attribut id,content,creation,title.

Q18) 
Hibernate permet d'accéder à la base de donnée et de créer la table si elle n'existe pas déja.



Q20)

on voit tout le contenu de data.sql


Q23)

@autowired nous permet de faire l�injection de d�pendances entre les beans de l�application


Q30)

Il faut ajouter la dépendance 

<dependency>
    <groupId>org.webjars</groupId>
   	<artifactId>bootstrap</artifactId>
	<version>3.3.6</version>
</dependency>

Q6) (DM 2/2)

Pour utiliser l'API Darsky, il faut une clé personnelle.

https://api.darksky.net/forecast/key/lat,lon

Il faut utiliser la méthode GET

https://api.darksky.net/forecast/clé/lat,lon?option=val

Dans Currently -> temperature

Dans la partie daily


Lien vers mon github : https://github.com/maximebizeray/DM_POO
