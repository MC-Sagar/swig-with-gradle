#include <string>
#include <vector>
#include <iostream>

struct FullName{

    std::string first_name, last_name;
    FullName(std::string fn, std::string ln) : first_name(fn), last_name(ln) {}

};

std::vector<FullName> getNames(){
    std::vector<FullName> names;

    names.push_back(FullName("Darth", "Vader"));
    names.push_back(FullName("Luke", "Skywalker"));

    return names;
}

void printAllNames(const std::vector<FullName> names){
    for(FullName name : names){
        std::cout << name.first_name << ", " << name.last_name << std::endl;
    }
}

int main(){
    printAllNames(getNames());
    std::cout << "Hello";

    return 0;
}