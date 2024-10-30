/**
 * Poem.java
 *
 * A class representing information about a poem for use in Chapter 5 Exercise 2
 *
 */
public class Poem
{

    private String name;
    private String poet;

    /**
     * no-arg constructor
     */
    public Poem()
    {
        // initialize attributes
        name = "unknown";
        poet = "unknown";
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the poet
     */
    public String getPoet()
    {
        return poet;
    }

    /**
     * @param poet the poet to set
     */
    public void setPoet(String poet)
    {
        this.poet = poet;
    }

    @Override
    public String toString()
    {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }

}