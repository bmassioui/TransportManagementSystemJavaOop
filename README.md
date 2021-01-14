# Transport Management System (Systeme de Gestion d'une Societe du Transport)
Series of exercices, for mastering **Java OOP Concepts** (*School exercice*)
## Excercice description (Frensh version)
> On souhaite créer une application Java qui permet gérer une société de transport de cargaisons (‫)الشحنات‬
transportant des marchandises. La société de transport gère un ensemble de cargaisons. Chaque cargaison
contient plusieurs marchandises. Chaque marchandise est définie par son numéro (long), son poids (double) et
son volume (double). Il existe deux types de cargaisons : Routière et Aérienne. Chaque cargaison est définie par
sa référence (long), sa distance de parcours (double) et sa masse limite (double). Le coût de transport d’une
cargaison est calculé en fonction du type de la cargaison.
Page : 1/2Pour une cargaison aérienne, le coût est calculé selon la formule suivante :
- cout = 10 x distance x poids total des marchandises si le volume total est inférieur à 80000
- cout = 12 x distance x poids total des marchandises si le volume total est supérieur ou égal à 80000
Une cargaison routière, le coût est calculé selon la formule suivante :
- cout = 4 x distance x poids total des marchandises si le volume total est inférieur à 380000
- cout = 6 x distance x poids total des marchandises si le volume total est supérieur ou égale à 380000
Pour chaque cargaison, on souhaite ajouter une marchandise, supprimer une marchandise, consulter une
marchandise sachant son numéro, consulter toutes les marchandises de la cargaison, consulter le poids total de
la cargaison, consulter le volume total de la cargaison et consulter le coût de la cargaison. La méthode
ajouterMarchandise permet d’ajouter une marchandise m passée en paramètre à la cargaison si cela est
possible. Sinon, la méthode déclenche une exception du type DepassementMasseException si la masse limite
de la cargaison est dépassée.
Cette application peut être utilisée par les clients et les administrateurs.
Le client peut effectuer les opérations suivantes prévues à travers l’interface IClientTransport :
- Consulter une cargaison sachant sa référence.
- Consulter une marchandise sachant son numéro.
- Consulter toutes les cargaisons.
L’administrateur peut effectuer toutes les opérations effectuées par le client. En plus, les opérations suivantes
prévues à travers l’interface IAdminTransport :
- Ajouter une nouvelle cargaison.
- Ajouter une marchandise à une cargaison.
- Supprimer une cargaison.
Questions :
1. Etablir le diagramme UML de classes complet (Cargaison, Marchandise, CargaisonRoutiere,
CargaisonAerienne,
DepassementMasseException,
IAdminTransport,
IClientTransport
et
SocieteTransport) en prenant en considération les critères suivants :
a. La classe SocieteTransport devrait implémenter les deux interfaces IClientTransport et
IAdminTranport déclarant, respectivement les opérations relatives aux rôles Client et Admin.
b. Les classes CargaisonRoutiere et CargaisonAerienne doivent redéfinir la méthode toString
pour afficher le type de la cargaison, sa référence et son coût.
c. Les classes Marchandise et Cargaison doivent aussi redéfinir la méthode equals en se basant
respectivement sur le numéro de la marchandise et sur la référence de la cargaison.
Nb. : Chaque classe du diagramme doit préciser les données (type et visibilité) et les méthodes (type,
paramètres et visibilité).
2. Donner l’implémentation Java des différentes classes et interfaces.

## Solution
1. 
