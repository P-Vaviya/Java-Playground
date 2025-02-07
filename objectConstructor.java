class objectConstructor{

    float width, length, height;

    objectConstructor(float width, float length, float height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    objectConstructor(objectConstructor obj){
        width = obj.width;
        length = obj.length;
        height = obj.height;
    }
    public static void main(String[] args){
        objectConstructor b1 = new objectConstructor(10.0f, 20.0f, 30.0f);
        objectConstructor b2 = new objectConstructor(b1);

        System.out.println(b2.length);

    }
}