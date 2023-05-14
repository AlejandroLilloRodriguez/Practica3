package aplicacion;

import pr2.Graph;
/*Copyright [año] [nombre del propietario del copyright]
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
        Unless required by applicable law or agreed to in writing,
        software distributed under the License is distributed on an
        "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
        either express or implied. See the License for the specific
        language governing permissions and limitations under the
        License.*/

public class Principal {

        public static void main(String[] args) {
            Graph<String> g = new Graph<>();
            g.addVertex("A");
            g.addVertex("B");
            g.addVertex("C");
            g.addVertex("D");
            g.addVertex("E");
            g.addVertex("F");
            g.addVertex("G");
            g.addVertex("H");
            g.addVertex("I");
            g.addEge("A", "B");
            g.addEge("A", "C");
            g.addEge("A", "D");
            g.addEge("A", "E");
            g.addEge("A", "F");
            g.addEge("A", "G");
            g.addEge("A", "H");
            g.addEge("A", "I");
            g.addEge("B", "C");
            g.addEge("B", "D");
            g.addEge("B", "E");
            g.toString();


        }
}
