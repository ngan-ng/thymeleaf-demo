## 1. Thymeleaf
- Thymeleaf is a modern server-side java template engine that works for both web and standalone environments.
- Thymeleaf template = HTML + Thymeleaf expressions.

![thymeleaf](/images/thymeleaf.jpg "thymeleaf")

![thymeleaf-browser](/images/thymeleaf-browser.jpg "thymeleaf-browser")

## 2. Iteration
Thymeleaf provides a status variable for us to keep track of the process.
Status variable has following properties which are very useful
- **index**: the current iteration index, starting with O (zero)
- **count**: the number of elements processed so far
- **size**: the total number of elements in the list
- **even**/**odd**: checks if the current iteration index is even or odd
- **first**: checks if the current iteration is the first one
- **last**: checks if the current iteration is the last one

## 3. Fragments 
There are three ways:
- **Include**: it will insert the fragment as the body of the host tag excluding the fragment tag
- **Insert**: It will insert the fragment along with fragment tag as the body of the host tag
- **Replace**: it will replace the host tag with the fragment tag. Host tag will be removed and the fragment tag is added along with the fragment tag