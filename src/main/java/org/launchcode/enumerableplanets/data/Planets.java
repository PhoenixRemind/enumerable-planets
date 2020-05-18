package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88, 35983125),
    VENUS("Venus", 225, 67238251),
    EARTH("Earth", 365, 92956050),
    MARS("Mars", 687, 141637725),
    JUPITER("Jupiter", 4333, 483638564),
    SATURN("Saturn", 10759, 886489415),
    URANUS("Uranus", 30687, 1783744300),
    NEPTUNE("Neptune", 60200, 2795173960L);

    private final String name;
    private final int yearLength;
    private final long orbitDistance;

    Planets(String name, int yearLength, long orbitDistance) {
        this.name = name;
        this.yearLength = yearLength;
        this.orbitDistance = orbitDistance;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public long getOrbitDistance() {
        return orbitDistance;
    }
}
