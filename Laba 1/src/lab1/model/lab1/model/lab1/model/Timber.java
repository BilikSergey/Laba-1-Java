package lab1.model.lab1.model.lab1.model;

import lab1.model.lab1.model.Wood;

public class Timber
{
    private Wood wood;
    private float lenght;
    private float height;
    private float width;

    public Timber(Wood wood, float length, float height, float width){
        this.wood = wood;
        this.lenght = length;
        this.height = height;
        this.width = width;
    }
        public float volume()
        {
            return lenght * height* width;
        }
        public float weight()
        {
            return wood.getDensity() * volume();
        }

    @Override
    public String toString() {
        return "Timber{" +
                "wood=" + wood +
                ", lenght=" + lenght +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
