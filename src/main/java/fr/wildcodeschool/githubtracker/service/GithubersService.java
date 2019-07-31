package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.DumbGithuberDAO;
import fr.wildcodeschool.githubtracker.dao.GithubersDAO;
import fr.wildcodeschool.githubtracker.model.Githubers;

import javax.inject.Inject;
import java.util.List;

public class GithubersService implements IServices{

    @Inject
    private GithubersDAO dao;

    @Override
    public List<Githubers> getGithubers() {
        return dao.findAll();
    }

    //print all students

    /*public GithubersService(GithubersDAO dao)
    {
        this.dao = dao;
    }*/

}