import  ReactDOM  from "react-dom"
import React from 'react'
import Quiz from "./Quiz"
import Quizes from "./Quizes"

function App() {
    return (
        <div>
            <Quiz />
        </div>
    )
}

export default App

const rootElement =document.getElementById('root')
ReactDOM.render(<App></App>, rootElement) 