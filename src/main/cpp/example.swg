%module example

%{
#include "example.cpp"
%}

%include "std_string.i"

%include "std_vector.i"
%template(FullNameVector) std::vector<FullName>;

%ignore main;

%include "example.cpp"