package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githubers;

import java.util.ArrayList;
import java.util.List;

public class DumbGithuberDAO implements GithubersDAO {

    @Override
    public List<Githubers> findAll() {

        List<Githubers> githuber = new ArrayList<>();

        githuber.add(new Githubers("Edwin","edwinbeledu@yahoo.fr","wendydrack","01","https://github.com/beleduedwin"));
        githuber.add(new Githubers("Sarah","sarah@orange.fr","sara01","02","https://github.com/test"));
        githuber.add(new Githubers("Patricia","patricia@hotmail.com","patr","03","test"));
        githuber.add(new Githubers("Patricia","patricia@hotmail.com","patr","03","test"));
        githuber.add(new Githubers("Max","max@yahoo.fr","maxpot","07","test"));

        return githuber;
    }

}
