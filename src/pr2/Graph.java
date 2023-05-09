package pr2;
import java.util.*;
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
public class Graph<V> {
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v) {
        if (adjacencyList.containsKey(v)) {
            return false;
        } else {
            adjacencyList.put(v, new HashSet<>());
            return true;
        }
    }

    public boolean addEge(V v1, V v2) {
        if (!adjacencyList.containsKey(v1)) {
            adjacencyList.put(v1, new HashSet<>());
        }
        if (!adjacencyList.containsKey(v2)) {
            adjacencyList.put(v2, new HashSet<>());
        }
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
        return true;
    }
    public Set<V> obtainAdjacents(V v) throws Exception{
        if(!adjacencyList.containsKey(v)){
            throw new Exception("No existe el vertice que se busca");
        }
         return adjacencyList.get(v);

    }
    public boolean containsVertex(V v){
        if (adjacencyList.containsKey(v)) {
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return adjacencyList.toString();
    }
    
    public List<V> onePath(V v1,V v2){
        Stack<V> pila = new Stack<>();
        Set<V> pisados = new HashSet<>();
        Map<V,Set<V>> traza = new HashMap<>();
        pila.push(v1);
        pisados.add(v1);
        boolean encontrado = false;
        while(!pila.empty()&&!encontrado){
            V v=pila.pop();
            pisados.add(v);
            if(v.equals(v2)) {
                encontrado = true;
            }else if(!encontrado){
                for (V w : adjacencyList.get(v)) {
                    if (!pisados.contains(w)) {
                        pila.push(w);
                        if (!traza.containsKey(w)) {
                            traza.put(w, new HashSet<>());
                        }
                        traza.get(w).add(v);
                    }
                }
            }

            }
        }




}

