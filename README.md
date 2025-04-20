# projet_devops
Déploiement en local (via Docker)
Pour un lancement 

Cloner le dépot :
git clone  https://github.com/len233/projet_devops

Rentrer dans le fichier projet_devops:
cd projet_devops

compiler le projet:
./gradlew build

Construire l'image:
docker build -t projet_devops

Vérifier l'image:
docker images

Démerrer le container:
docker run -p 4000:8181 projet_devops
