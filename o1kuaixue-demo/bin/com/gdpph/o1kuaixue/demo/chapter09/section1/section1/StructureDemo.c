#include <stdio.h>
// C语言中结构体示例
int main(){
    // 定义结构体 Person
    struct Person{
        // 结构体包含的变量
        char *name;
        int age;
        float height;
        float weight;
    };
    // 通过结构体来定义变量
    struct Person person;
    // 操作结构体的成员
    person.name = "小王";
    person.age = 25;
    person.height = 181.2;
    person.weight = 75.0;

    return 0;
}