const themeSwitcher = document.getElementById('theme-switcher');
const htmlElement = document.documentElement;

themeSwitcher.addEventListener('click', () => {
    htmlElement.classList.toggle('dark-mode');
    if (htmlElement.classList.contains('dark-mode')) {
        localStorage.setItem('theme', 'dark');
    } else {
        localStorage.setItem('theme', 'light');
    }
});
