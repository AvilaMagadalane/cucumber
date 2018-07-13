# language: fr
@chercher
Fonctionnalité: Chercher
  Je veux chercher sur le site

	Contexte:
	Étant donné que je suis sur la page d'accueil

  @smoke
  Scénario: Recherche par mot clé
    Quand je remplis "champ de recherche" avec "robe"
    Alors Je clique "bouton de recherche"
