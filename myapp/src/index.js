import React from 'react'; //defines JSX
import ReactDOM from 'react-dom'
import './index.css';
import App from './App';
import navbar from "./components/navbar";

function HeaderContent(){
    return(
        <header>
            <nav>
                <li>Bøker</li>
                <li>Forfattere</li>
                <li>Om oss</li>
            </nav>
        </header>
    )
}

function MainContent(){
    return(
        <div>
            <h1>Hello, this is the main content</h1>
            <p>Testint content</p>
        </div>
    )
}

function FooterContent(){
    return(
        <footer>
            <h1>Trademark reaact-library</h1>
        </footer>
    )
}

function Page(){
    return (
        <div>
            <HeaderContent/>
            <MainContent/>
            <FooterContent/>
        </div>
    )
}

ReactDOM.render(<Page/>, document.getElementById("root"));
