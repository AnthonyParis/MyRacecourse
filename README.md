# Stratégie de tests



Le projet MyRacecours est composé de 3 classes principales, qui définissent les objets suivants :



​	• Racecourse (Nom)

​	• Race (Nom, date, participants, gagnant)

​	• Cheval (Nom, âge, nombre de victoires)



Lors du développement du projet, j'ai commencé à écrire les tests, qui définissent la facon dont ces elements doivent se comporter. Prenons l'exemple du cheval, qui doit avoir un nom à sa création. Deux cas de figure peuvent se produire :



​	• Soit le nom entré est correct, et dans ce cas, il est assigné au cheval.

​	• Soit le nom est incorrect, et le cheval garde son nom par défaut, qui est une chaine vide.



Pour vérifier cela, deux méthodes de test sont alors crées. testHorseCreateWithNameIsSuccess qui va instantier un cheval avec un nom valide, et vérifie que ce nom est bien assigné au cheval, et testHorseCreateWithNameIsFailed qui initialise un cheval avec un nom invalide, et vérifie que ce nom n'a pas été enregistré, en vérifiant que le cheval à bien pour nom une chaine de caractères vide. (Qui est sa valeur initiale)



Cette logique est utilisée de la même façon sur les différentes méthodes et cas de figure que le cheval peut rencontrer. Par exemple, il à également un attribut age, qui doit être initialisé à sa création, et doit être compris entre 0 et 100. Les méthodes testHorseCreateWithAgeIsSuccess et testHorseCreateWithAgeIsFailed vont donc instancier deux cheveaux, l'un avec un age valide, l'autre avec un age incorrect, et vérifier que les cheveaux ont bien les âges attendus (Soit ceux indiqués, soit la valeur par défaut)



Enfin, j'ai également testés des listes de cheveaux, en testant notamment l'ajout et la suppression dans une liste, via les méthodes testHorseDeleteIsSuccess et testHorseDeleteIsFailed. Une fois ces fonctions définies et testées avec succès, il suffit ensuite d'implémenter le corps de ces fonctions, dans le fichier Horse.java, tout en veillant à ce que tous les tests restent positifs.



Cette stratégie expliquée ici pour les cheveaux est celle qui est utilisée tout au long du projets, pour les classes Race et Horserace, afin de garantir un fonctionnement optimal du projet, et s'assurer que chaque méthode fonctionne correctement.



Une fois ces trois classes entièrement implémentées et testées, j'ai ajouté une dernière class, Main, dont le but est d'afficher un menu, et de demander à l'utilisateur ce qu'il souhaite faire. Chaque action va ensuite appelé l'une des méthodes définies précédemment.



Enfin, j'ai également ajouté deux modes de tests, via les méthodes debugSingleRace et debugMultipleRace, qui vont simuler un hippodrome prédéfini, afin de pouvoir tester rapidement et efficacement les derniers cas de figure. Ces méthodes sont également testées, et je les ai laissées dans le code source du projet, afin que vous puissiez tester vous aussi des exemples prédéfinis.



Anthony Khelil



PS. Je n'ai pas de groupe, j'ai préféré faire le projet en solo

