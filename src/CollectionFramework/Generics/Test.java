package CollectionFramework.Generics;

public class Test<T> {
    private T data; 

    public Test(T data){
        this.data = data; 
    }

    public T getData(){
        return data; 
    }
}
