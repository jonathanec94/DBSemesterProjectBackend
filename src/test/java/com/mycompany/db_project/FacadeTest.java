/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db_project;

import DbInterface.Facade;
import entity.Book;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author nikolai
 */
public class FacadeTest {
    
    public FacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAllCities method, of class Facade.
     */
    @Test
    public void testFindAllCities() throws IOException, FileNotFoundException {
        //Should not be null
        Facade instance = new Facade(null);
        //Book book = instance.findAllPossibleCitiesInBook("/home/nikolai/NetBeansProjects/Db_project/src/test/10267.txt");
        Book book = instance.findAllPossibleCitiesInBook("/10267.txt");
        assertThat(book.getAuthor(), is("Captain Quincy Allen"));
        assertThat(book.getTitle(), is("The Outdoor Chums"));
        assertThat(book.getTmpCities().size(), is(453));
    }
    
}
